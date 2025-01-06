package test.jichu;

import java.util.*;
import java.util.stream.Collectors;

public class DempDemo {
    public static void main(String[] args) {
        ArrayList<ProjectDeliverBackground> projectDeliverBackgroundList = new ArrayList<>();
        ProjectDeliverBackground pro = new ProjectDeliverBackground();
        pro.setCustomerId("1");
        pro.setStatus(ProjectDeliverStatusEnum.UN_STARTED);
        pro.setBusinessUserIdList(Collections.singletonList("u1"));
        projectDeliverBackgroundList.add(pro);

        //
        List<String> customerIdList = new ArrayList<String>(){{add("1");add("2");}};
        List<String> businessUserIdList = new ArrayList<String>(){{add("u1");add("u2");}};
        ProjectDeliverStatusEnum status = ProjectDeliverStatusEnum.IN_PROCESSING;
        List<ProjectDeliverBackground> collect = projectDeliverBackgroundList.stream().filter(a ->
                CollectionUtils.isEmpty(customerIdList) || customerIdList.contains(a.getCustomerId()) &&
                        new HashSet<>(a.getBusinessUserIdList()).containsAll(new HashSet<>(businessUserIdList)) &&
                        status == null || status.equals(a.getStatus())
        ).collect(Collectors.toList());

    }



}

