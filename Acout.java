package Btvn;

public class Acout<date> {
    private int Id;

    private String Usname;
    private String Password;
    private String Phone;
    private String Date;

    public Acout(int id, String usname, String password, String phone, String date) {
        Id = id;

        Usname = usname;
        Password = password;
        Phone = phone;
        Date = date;
    }

    public Acout() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }


    public String getUsname() {
        return Usname;
    }

    public void setUsname(String usname) {
        Usname = usname;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String tostring() {
        return "co Id La"  +this.Id + "co ten la " + this.Usname + "co pass la " + this.Password + "co sdt la " + this.Phone + "co ngay sinh la " + this.Date;
    }
}
