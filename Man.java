class Man
{
    private int ageMan = 0;
    private String nameMan = null;
    private static String genderMan = "Мужчина";

    public Man(String nameMan, int ageMan)
    {
        this.ageMan = ageMan;
        this.nameMan = nameMan;
    }

    public String getGenderMan()
    {
        return genderMan;
    }

    public int getAgeMan()
    {
        return ageMan;
    }

    public String getNameMan()
    {
        return nameMan;
    }
}
