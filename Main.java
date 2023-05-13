public class Main
{
    public static void main(String[] args)
    {
        for(int i = 0; i < test().length; ++ i)
        {
            if(test()[i] == null)
                System.out.println("null");
            else if(test()[i].genderFriend.equals("Мужчина"))
                System.out.println(test()[i].toStringMan());
            else if(test()[i].genderFriend.equals("Женщина"))
                System.out.println(test()[i].toStringGirl());
        }
    }

    static Friends[] test()
    {
        Friends one = new Friends("Мужчина", "Миша", 26);
        Friends two = new Friends("Женщина", "Влада", 24);
        Friends three = new Friends("Мужчина", "Влад", 27);
        return myFriends(one, two, three);
    }

    static Friends[] myFriends(Friends one,Friends two, Friends three)
    {
        Friends[] friends = new Friends[]{one,three, two, null};
        return friends;
    }
}