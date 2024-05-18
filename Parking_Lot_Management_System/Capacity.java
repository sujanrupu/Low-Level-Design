public class Capacity {
    int capacity = 0;

    public boolean isVacant() {
        if(capacity >= 8)
            return false;
        else
            return true;
    }

    public void fillCapacity () {
        capacity++;
    }
}
