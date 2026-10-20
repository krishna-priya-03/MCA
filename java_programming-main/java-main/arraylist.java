import java.util.*;
public class arraylist{
    public static void main(String args[]){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("vibgyor");
        arrayList.add("indigo");
        arrayList.add("violet");
        arrayList.add("green");

        System.out.println("First elements is "+arrayList.get(0));

        System.out.println("The element of the arraylist is -"+arrayList);

        Collections.sort(arrayList);
        System.out.println("\n The arraylist sorted :"+arrayList);

        Collections.addAll(arrayList,"red","blue","orange","yellow");
        System.out.println("\n Adding new items in the arraylist is :"+arrayList);

        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println("\n The reverse order of the arraylist :"+arrayList);
        System.out.println("\n The maximum element of the arraylist :"+Collections.max(arrayList));

        for(String word:arrayList)
        {
            System.out.println(word);
        }

        arrayList.set(0,"violet");
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
