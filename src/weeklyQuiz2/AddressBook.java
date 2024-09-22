package chap08.src.weeklyQuiz2;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contact> contacts;

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void displayContact() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        } else {
            for (Contact contact : contacts) {
                String contactInfo = "이름: " + contact.getName() + ", 전화번호: " + contact.getPhoneNumber();

                if (contact instanceof BusinessContact) {
                    BusinessContact businessContact = (BusinessContact) contact;
                    contactInfo += ", 회사명: " + businessContact.getCorporation();
                }
                else if (contact instanceof PersonalContact) {
                    PersonalContact personalContact = (PersonalContact) contact;
                    contactInfo += ", 관계: " + personalContact.getRelationShip();
                }
                System.out.println(contactInfo);
            }
        }
    }

    public String searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                String contactInfo = "이름: " + contact.getName() + ", " + "전화번호: " + contact.getPhoneNumber() + ", ";

                if (contact instanceof BusinessContact) {
                    BusinessContact businessContact = new BusinessContact();
                    contactInfo += "회사명: " + businessContact.getCorporation();
                } else if (contact instanceof PersonalContact) {
                    PersonalContact personalContact = (PersonalContact) contact;
                    contactInfo += "관계: " + personalContact.getRelationShip();
                }
                return contactInfo;
            }
        }
        return "연락처를 찾을 수 없습니다";
    }
}