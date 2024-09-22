package chap08.src.weeklyQuiz2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.printf("메뉴를 선택해주세요: ");
            int num = Integer.parseInt(scanner.nextLine());

            // 비즈니스 연락처 추가
            if (num == 1) {
                BusinessContact businessContact = new BusinessContact();
                System.out.printf("이름을 입력하세요: ");
                businessContact.setName(scanner.nextLine());

                System.out.printf("전화번호을 입력하세요: ");
                businessContact.setPhoneNumber(scanner.nextLine());

                System.out.printf("회사명을 입력하세요: ");
                businessContact.setCorporation(scanner.nextLine());

                addressBook.addContact(businessContact);
                System.out.println();
            }
            // 개인 연락처 추가
            else if(num == 2) {
                PersonalContact personalContact = new PersonalContact();

                System.out.printf("이름을 입력하세요: ");
                personalContact.setName(scanner.nextLine());

                System.out.printf("전화번호를 입력하세요: ");
                personalContact.setPhoneNumber(scanner.nextLine());

                System.out.printf("관계를 입력하세요: ");
                personalContact.setRelationShip(scanner.nextLine());

                addressBook.addContact(personalContact);
                System.out.println();
            }
            // 연락처 출력
            else if(num == 3) {
                System.out.println();
                addressBook.displayContact();
            }

            // 연락처 검색
            else if(num == 4) {
                System.out.printf("검색할 이름을 입력하세요: ");
                String name = scanner.nextLine();
                String result = addressBook.searchContact(name);
                System.out.println(result);
            }
            
            // 종료
            else if(num == 5) {
                break;
            }

            // 종료
            else {
                System.out.println("옳지 않은 숫자입니다.");
            }

            System.out.println();
            System.out.println("========================");
            System.out.println();
        }
    }
}