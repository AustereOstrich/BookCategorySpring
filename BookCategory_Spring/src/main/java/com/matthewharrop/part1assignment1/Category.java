package com.matthewharrop.part1assignment1;

import java.security.KeyPair;
import java.util.*;

public class Category {

    private Long id;
    private String name;
    private Set<Book> bookSet;
    private List<Book> bookList;
    private Map<String, Book> bookMap;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public List<Book> getbookList() {
        return bookList;
    }


    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Map<String, Book> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<String, Book> bookMap) {
        this.bookMap = bookMap;
    }

    ArrayList<String> outputWrapper(String collectionName) {
        int stringWidth = 0;
        String outputStart = collectionName + " Output Start ";
        String outputEnd = collectionName + " Output End ";
        for (Character character : outputStart.toCharArray()) {
            stringWidth++;
        }
        ;
        StringBuilder builder = new StringBuilder(outputStart);
        while (stringWidth < 60) {
            builder.insert(0, "=");
            builder.append("=");
            stringWidth += 2;
        }
        builder.append("\n");
        stringWidth = 0;
        for (Character character : outputEnd.toCharArray()) {
            stringWidth++;
        }
        ;
        StringBuilder builder2 = new StringBuilder(outputEnd);
        while (stringWidth < 60) {
            builder2.insert(0, "=");
            builder2.append("=");
            stringWidth += 2;
        }
        builder2.insert(0, "\n");
        builder2.append("\n");
        ArrayList<String> array = new ArrayList<String>();
        array.add(builder.toString());
        array.add(builder2.toString());
        for (String string : array) {
            string.concat("\n");
        }
        return array;
    }

    public String toString(Collection collection, String collectionDescription) {
        String string = "";
        string = string.concat(outputWrapper("Books Set").get(0));
        string = string.concat("Category -- ID: " + id + ", Name: " + name + ", Books: ");
        int bookNum = 0;
//        Iterator bookIterator = collection.iterator();
//        while (bookIterator.hasNext()) {
//            string = string.concat(bookIterator.next().toString());
//            if (bookIterator.hasNext()) {
//                string = string.concat(", ");
//            }
//        }
        for (Object object : collection) {
            string = string.concat(object.toString());
        }
        string = string.concat(outputWrapper(collectionDescription).get(1));


        return string;
    }

    public String toString() {

        String string = "\n";

        if (bookSet != null) {


            string = string.concat(outputWrapper("Books Set").get(0));
            string = string.concat("Category -- ID: " + id + ", Name: " + name + ", Books Set: ");
            int bookNum = 0;
            Iterator<Book> bookIterator = bookSet.iterator();
            while (bookIterator.hasNext()) {
                string = string.concat(bookIterator.next().toString());
                if (bookIterator.hasNext()) {
                    string = string.concat(", ");
                }
            }
            string = string.concat(outputWrapper("Books Set").get(1));

        }

        if (bookList != null) {


            string = string.concat(outputWrapper("Books List").get(0));
            string = string.concat("Category -- ID: " + id + ", Name: " + name + ", Books List: ");
            int bookNum = 0;
            Iterator<Book> bookIterator = bookList.iterator();
            while (bookIterator.hasNext()) {
                string = string.concat(bookIterator.next().toString());
                if (bookIterator.hasNext()) {
                    string = string.concat(", ");
                }
            }
            string = string.concat(outputWrapper("Books List").get(1));
        }

        if (bookMap != null) {


            string = string.concat(outputWrapper("Books Map").get(0));
            string = string.concat("Category -- ID: " + id + ", Name: " + name + ", Books Map: ");

            string = string.concat("Key 1: " + bookMap.get("1").toString() + ", ");
            string = string.concat("Key 2: " + bookMap.get("2").toString());

            string = string.concat(outputWrapper("Books Map").get(1));
        }

        return string;

    }

}
