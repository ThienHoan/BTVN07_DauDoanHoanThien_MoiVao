package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import model.Phone;


public  class PhoneBook extends Phone {
    public ArrayList<PhoneBook> phoneList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public PhoneBook(String name, String phone, String newphone) {
        super(name, phone, newphone);
    }

    @Override
    public void insertPhone() {
        System.out.println("Moi ban nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Moi ban nhap so dien thoai: ");
        String phone = sc.nextLine();
        boolean ktrTen = false;

       

        for (int i = 0; i < phoneList.size(); i++) {
            PhoneBook nhapVao = phoneList.get(i);
            if (nhapVao.getName().equals(name)) {
                ktrTen = true;
                if(!nhapVao.getPhone().contains(phone)){
                    nhapVao.setPhone(nhapVao.getPhone()+ " : " + phone);
                }
                break;
            }
        }

        if(ktrTen == false){
            phoneList.add(new PhoneBook(name, phone, ""));
        }
        
            for (PhoneBook t : phoneList) {
                System.out.println(t.toString());
            }

    }
    @Override
    public String toString() {
        return "Name: " + getName() + ", Phone: " + getPhone();
    }

    @Override
    public void rmPhone() {

        for (PhoneBook ph : phoneList) {
            System.out.println(ph.toString());
        }
        System.out.println("Moi ban nhap nguoi muon xoa: ");
        String rm = sc.nextLine();
        for (int j = 0; j < phoneList.size(); j++) {
            if(phoneList.get(j).getName().equals(rm)){
                phoneList.remove(j);
                System.out.println("Xoa thanh cong");
            }else{
                System.out.println("Khong tim thay ten");
            }
            
        }
        for (PhoneBook phoneBook : phoneList) {
            System.out.println(phoneBook.toString());
        }
        


    }

    @Override
    public void searchPhone() {
        System.out.println("Mời bạn nhập tên: " );
        String name = sc.nextLine();
        for (int i = 0; i < phoneList.size(); i++) {
            if(phoneList.get(i).getName().equals(name)){
                System.out.println("Số bạn cần tìm là: " + phoneList.get(i).getPhone());
                break;
            }else{
                System.out.println("Tên bạn Nhập không có");
            }
        }
    }

    @Override
    public void sort() {
        for (int i = 0; i < phoneList.size(); i++) {
            for (int j = i + 1; j < phoneList.size() ; j++) {
                PhoneBook phone1 = phoneList.get(i);
                PhoneBook phone2 = phoneList.get(j);
                if(phone1.getName().compareTo(phone2.getName()) > 0){
                    phoneList.set(i, phone2);
                    phoneList.set(j, phone1);
                }
            }
        }

    }

    
    @Override
    public void updatePhone() {
        for (PhoneBook pt : phoneList) {
            System.out.println(pt.toString());
        }
        System.out.println("Moi ban nhap ten nguoi muon sửa: ");
        String ten = sc.nextLine();
        for (PhoneBook i : phoneList) {
            if(i.getName().equals(ten)){
                System.out.println("Moi ban nhap so moi: ");
                String soMoi = sc.nextLine();
                i.setPhone(soMoi);
                System.out.println("Thay doi thanh cong");
                break;
            }else{
                System.out.println("Khong tìm thấy người dùng");

            }
            
        }
        
    }

}
