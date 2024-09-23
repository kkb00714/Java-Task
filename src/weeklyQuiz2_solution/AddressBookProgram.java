package chap08.src.weeklyQuiz2_solution;

import chap08.src.weeklyQuiz2.Contact;

import java.util.Scanner;

public class AddressBookProgram {
    static void printMenu() {
        String menu = """
        1. 비즈니스 연락처 추가
        2. 개인 연락처 추가
        3. 연락처 출력
        4. 연락처 검색
        5. 종료
        메뉴를 선택해주세요.
        """;

        System.out.println(menu);
    }

    public static void main(String[] argS) {

        AddressBook addressBook = new AddressBook();
        while (true) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int selectedMenu = Integer.parseInt(scanner.nextLine());

            switch (selectedMenu) {
                case 1:
                    System.out.printf("이름을 입력하세요: ");
                    String name = scanner.next();

                    System.out.printf("전화번호을 입력하세요: ");
                    String phoneNumber = scanner.next();

                    System.out.printf("회사명을 입력하세요: ");
                    String company = scanner.next();

                    addressBook.add(new BusinessContact(name, phoneNumber, company));
                    break;

                case 2:
                    System.out.printf("이름을 입력하세요: ");
                    String name2 = scanner.next();

                    System.out.printf("전화번호을 입력하세요: ");
                    String phoneNumber2 = scanner.next();

                    System.out.printf("관계를 입력하세요: ");
                    String relationship = scanner.next();

                    addressBook.add(new PersonalContact(name2, phoneNumber2, relationship));
                    break;

                case 3:
                    addressBook.displayContacts();
                    break;
                case 4:
                    String searchName = scanner.nextLine();
                    addressBook.searchContact(searchName);
                    break;
                case 5:
                    return;
            }
        }
    }
}
