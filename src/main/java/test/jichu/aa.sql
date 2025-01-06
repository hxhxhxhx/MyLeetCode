SELECT
    a.xh,
    a.kcbid,
    a.xsyhid,
    a.num,
    b.kcbid,
    b.totalNum,
    jbxx.xm,
    kcxx.kcmc,
    kcxx.kcptbh
FROM
    (
        SELECT
            xxhdxx.kcbid,
            zycjb.xsyhid,
            zycjb.xh,
            COUNT( 1 ) num
        FROM
            t_xydnjcsjj_xxhdxx xxhdxx
                LEFT JOIN t_xydnjcsjj_zycjb zycjb ON xxhdxx.id = zycjb.zyhdid
        WHERE
                xxhdxx.sfysc = '0'
          AND xxhdxx.xxhdlx = '3'
          AND zycjb.sfysc = '0'
          AND xxhdxx.kcbid IN (
            SELECT
                id
            FROM
                t_xydnjcsjj_kcxx
            WHERE
                    kcptbh IN ( SELECT xkkh FROM t_xydnjcsjj_bksxkxx WHERE xn = '2024-2025' AND xq = '1' GROUP BY xkkh ))
        GROUP BY
            xxhdxx.kcbid,
            zycjb.xsyhid,
            zycjb.xh
    ) a
        LEFT JOIN (
        SELECT
            a.kcbid,
            COUNT( 1 ) totalNum
        FROM
            (
                SELECT
                    xxhdxx.kcbid,
                    zycjb.zyhdid
                FROM
                    t_xydnjcsjj_xxhdxx xxhdxx
                        LEFT JOIN t_xydnjcsjj_zycjb zycjb ON xxhdxx.id = zycjb.zyhdid
                WHERE
                        xxhdxx.sfysc = '0'
                  AND xxhdxx.xxhdlx = '3'
                  AND zycjb.sfysc = '0'
                  AND xxhdxx.kcbid IN (
                    SELECT
                        id
                    FROM
                        t_xydnjcsjj_kcxx
                    WHERE
                            kcptbh IN ( SELECT xkkh FROM t_xydnjcsjj_bksxkxx WHERE xn = '2024-2025' AND xq = '1' GROUP BY xkkh ))
                GROUP BY
                    xxhdxx.kcbid,
                    zycjb.zyhdid
            ) a
        GROUP BY
            a.kcbid
    ) b ON a.kcbid = b.kcbid
        LEFT JOIN t_xydnjcsjj_bksjbxx jbxx ON a.xh = jbxx.xh
        LEFT JOIN t_xydnjcsjj_kcxx kcxx ON a.kcbid = kcxx.id