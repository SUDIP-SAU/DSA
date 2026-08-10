class Solution {
    public boolean lemonadeChange(int[] bills) {

        List<Integer> money = new ArrayList<>();

        for (int bill : bills) {

            if (bill == 5) {
                money.add(5);
            }

            else if (bill == 10) {

                int index = money.indexOf(5);

                if (index == -1)
                    return false;

                money.remove(index);
                money.add(10);
            }

            else {

                int ten = money.indexOf(10);
                int five = money.indexOf(5);

                if (ten != -1 && five != -1) {

                    money.remove(ten);
                    
                    five = money.indexOf(5);
                    money.remove(five);

                } else {

                    five = money.indexOf(5);

                    if (five == -1)
                        return false;

                    money.remove(five);

                    five = money.indexOf(5);

                    if (five == -1)
                        return false;

                    money.remove(five);

                    five = money.indexOf(5);

                    if (five == -1)
                        return false;

                    money.remove(five);
                }

                money.add(20);
            }
        }

        return true;
    }
}