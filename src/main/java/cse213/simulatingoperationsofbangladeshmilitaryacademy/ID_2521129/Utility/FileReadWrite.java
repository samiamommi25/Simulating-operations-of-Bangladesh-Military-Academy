package cse213.simulatingoperationsofbangladeshmilitaryacademy.ID_2521129.Utility;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public final class FileReadWrite {

    private FileReadWrite() {
    }

    public static <T extends Serializable> void appendObject(String filePath, T obj) {
        File file = new File(filePath);
        boolean exists = file.exists() && file.length() > 0;

        try (FileOutputStream fos = new FileOutputStream(file, true);
             ObjectOutputStream oos = exists
                     ? new AppendableObjectOutputStream(fos)
                     : new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T extends Serializable> void writeAllObjects(String filePath, ArrayList<T> list) {
        File file = new File(filePath);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for (T obj : list) {
                oos.writeObject(obj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static <T extends Serializable> ArrayList<T> readAllObjects(String filePath) {
        ArrayList<T> list = new ArrayList<>();
        File file = new File(filePath);

        if (!file.exists() || file.length() == 0) {
            return list;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    T obj = (T) ois.readObject();
                    list.add(obj);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return list;
    }
}