package chap08.src.weeklyQuiz2_solution;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void add (Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        } else {
            // 연락처 정보 모두 출력
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void searchContact(String name) {
        boolean isExist = false;
        for (Contact contact: contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(contact);
                isExist = true;
            }

            if (!isExist) {
                System.out.println("연락처를 찾을 수 없습니다.");
            }
        }
    }
}
