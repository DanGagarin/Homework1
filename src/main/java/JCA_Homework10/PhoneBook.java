package JCA_Homework10;

import java.util.ArrayList;

public class PhoneBook extends ArrayList<Phone> {

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Phone phone : this) {
            stringBuilder.append("----------------------------\n");
            stringBuilder.append("Name:" + phone.getName() + "\n");
            stringBuilder.append("Number:" + phone.getNumber() + "\n");
        }

        return stringBuilder.toString();
    }
}
