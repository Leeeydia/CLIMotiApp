package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== motivation 실행 ==");

        int lastId = 0;


        List<Motivation> motivations = new ArrayList<>();

        while (true) {
            System.out.print("명령어 ) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                System.out.println("== motivation 종료 ==");
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어가 입력되지 않았음");
                continue;
            }

            if (cmd.equals("add")) {
                int id = lastId + 1;

                // 정보
                System.out.print("body : ");
                String body = sc.nextLine();
                System.out.print("source : ");
                String source = sc.nextLine();

                //조립
                Motivation motivation = new Motivation();
                motivation.id = id;
                motivation.body = body;
                motivation.source = source;

                motivations.add(motivation);




                System.out.printf("%d번 motivation이 등록되었습니다\n", id);
                lastId++;
            } else if (cmd.equals("list")) {
                System.out.println("=".repeat(40));
                System.out.printf("   번호   /    source    /    motivation   \n");


                if (motivations.size() == 0) {
                    System.out.println("등록된거 없음 xxxxx");
                } else {
                    System.out.println("1개 이상 있음 oooo");

                    // 실제로 한 개 이상 있는 걸 보여줘야 함
                    // for-each ?  %d %s %S 이거 찾아보기
                    // ArrayList get으로 가져오는 법 공부
                }

            }
        }


    }
}

// public 으로 X
// private로 사용하는 것이 관례 -> 게터 세터 ? 복습
class Motivation {
    int id;

    @Override
    public String toString() {
        return "Motivation{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", source='" + source + '\'' +
                '}';
    }

    String body;
    String source;
}