package test.jichu;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class tt1 implements tt{

    @Override
    public void test(String type) {
        System.out.println("tt1");
        if ("1".equals(type)) {
            System.out.println("1");
        }
        if ("2".equals(type)) {
            System.out.println("2");
        }
    }

    private final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) {
//        for (;;){
//
//        }
        System.out.println("888");
        boolean b = true;
//        while(b){
//
//        }
        for (; b;){

        }
        String str = "12_345";
        String[] split = str.split("_");
        System.out.println(split[0]);
        System.out.println(split[1]);
    }
    public String accept(String method, Object params) throws JsonProcessingException {
//        log.info("HK data:method:{}, params:{}", method, params);
            HashMap map = objectMapper.readValue(String.valueOf(params), HashMap.class);
            List<Map> list = (List)map.get("events");
            for (Map m : list){
                Map mm = (Map) m.get("data");
                String inOut = String.valueOf(mm.get("ExtEventInOut"));
                String direction = "";
                if ("1".equals(inOut)){
                    direction = "in";
                } else if ("0".equals(inOut) || "2".equals(inOut)) {
                    direction = "out";
                }
                HashMap<String, String> map1 = new HashMap<>();
                map1.put("userNo",String.valueOf(mm.get("ExtEventPersonNo")));
                map1.put("accessDoorNo",String.valueOf(m.get("srcIndex")));
                map1.put("accessDoorName",String.valueOf(m.get("srcName")));
                map1.put("accessPlaceName","");
                map1.put("accessTime",String.valueOf(mm.get("ExtReceiveTime")).substring(0,13));
                map1.put("direction",direction);
                map1.put("unionId",String.valueOf(m.get("eventId")));
//                kafkaTemplate.send(TOPIC,objectMapper.writeValueAsString(map1));
            }
        return "";
    }
}
