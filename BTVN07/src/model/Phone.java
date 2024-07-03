package model;

public abstract class Phone {
    protected String name, phone, newphone;

    public Phone(String name, String phone, String newphone) {
        this.name = name;
        this.phone = phone;
        this.newphone = newphone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNewphone() {
        return newphone;
    }

    public void setNewphone(String newphone) {
        this.newphone = newphone;
    }

    @Override
    public String toString() {
        return "Phone [name=" + name + ", phone=" + phone + ", newphone=" + newphone + "]";
    }
    public abstract void insertPhone();
    public abstract void rmPhone();
    public abstract void updatePhone();
    public abstract void searchPhone();
    public abstract void sort();
    
}
