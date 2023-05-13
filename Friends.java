class Friends
{
    Man friendMan = null;
    Girls friendGirls = null;
    String genderFriend = null;

    public Friends(String genderFriend, String name, int age)
    {
        this.genderFriend = genderFriend;
        if(genderFriend.equals("Мужчина"))
        {
            friendMan = new Man(name, age);
        }
        else
            friendGirls = new Girls(name, age);
    }

    public String toStringMan()
    {
        return "Friends{" +
                "genderFriend='" + friendMan.getGenderMan() + '\'' +
                ", age=" + friendMan.getAgeMan() +
                ", name='" + friendMan.getNameMan() + '\'' +
                '}';
    }

    public String toStringGirl()
    {
        return "Friends{" +
                "genderFriend='" + friendGirls.getGenderGirl() + '\'' +
                ", age=" + friendGirls.getAgeGirl() +
                ", name='" + friendGirls.getNameGirl() + '\'' +
                '}';
    }
}
