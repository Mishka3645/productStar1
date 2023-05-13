class Girls
{
    private int ageGirl = 0;
    private String nameGirl = null;
    private static String genderGirl = "Женщина";

    public Girls(String nameGirl, int ageGirl)
    {
        this.ageGirl = ageGirl;
        this.nameGirl = nameGirl;
    }

    public String getGenderGirl()
    {
        return genderGirl;
    }

    public String getNameGirl()
    {
        return nameGirl;
    }

    public int getAgeGirl()
    {
        return ageGirl;
    }
}
