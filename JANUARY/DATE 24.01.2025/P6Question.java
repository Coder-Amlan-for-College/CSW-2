class Account{
    private String accNo,name,email;
    private double amount;
    void setAccNo(String accNo){
        this.accNo = accNo;
    }
    void setAccName(String name){
        this.name = name;
    }
    void setEmail(String email){
        this.email = email;
    }
    void setAmount(double amount){
        this.amount = amount;
    }

    public String getAccNo(){
        return accNo;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public double getAmount(){
        return amount;
    }


}
public class P6Question {
   public static void main(String[] args) {
      Account obj = new Account();
      obj.setAccNo("123456");
      obj.setAccName("Amlan Anshuman Nayak");
      obj.setEmail("amlan@gmail.com");
      obj.setAmount(20000);
      System.out.println("Account Number: "+obj.getAccNo());
      System.out.println("Account Name: "+obj.getName());
      System.out.println("Email:"+obj.getEmail());
      System.out.println("Amount: "+obj.getAmount());


   }    
}
