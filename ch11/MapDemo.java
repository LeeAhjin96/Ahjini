package ch11;

import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> fruits =
                Map.of("사과",5,"바나나",3,"포도",10,"딸기",1);
        System.out.println(fruits.size() + "종류의 과일이 있습니다.");
        System.out.println(fruits);

        for (String key : fruits.keySet())
            System.out.println(key + "가" + fruits.get(key) + "개 있슴다");

        String key = "바나나";
        if (fruits.containsKey(key))
            System.out.println(key + "가" + fruits.get(key) + "개 있습니다.");

        fruits.forEach((k, n) -> System.out.print(k + "(" + n + ")"));
    }
}
