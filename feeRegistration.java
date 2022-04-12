interface feeRegistration {
    //This is an interface which is an abstraction between Regestration class and feePayement class.Dependency Inversion.High level module do not depend on low level module

   public int getDue();

    public void feePay();

    public void getReciept();

}
