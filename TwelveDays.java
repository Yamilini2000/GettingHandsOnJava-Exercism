class TwelveDays {
    String[] days = {"first", "second", "third", "fourth", "fifth", "sixth",
                     "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    String[] gifts = {"a Partridge in a Pear Tree", "two Turtle Doves",
                      "three French Hens", "four Calling Birds",
                      "five Gold Rings", "six Geese-a-Laying",
                      "seven Swans-a-Swimming", "eight Maids-a-Milking",
                      "nine Ladies Dancing", "ten Lords-a-Leaping",
                      "eleven Pipers Piping", "twelve Drummers Drumming"};
    String verse(int verseNumber) {
        StringBuilder output = new StringBuilder("On the ");
        output.append(this.days[verseNumber -1]);
        output.append(" day of Christmas my true love gave to me, ");
        if (verseNumber > 1) {
            for (int i = verseNumber - 1; i > 0; i--) {
                output.append(gifts[i] + ", ");
            }
            output.append("and ");
        }
        output.append(gifts[0] + ".\n");
        return output.toString();
    }
    String verses(int startVerse, int endVerse) {
        StringBuilder output = new StringBuilder();
        for (int i = startVerse; i < endVerse; i++) {
            output.append(verse(i) + "\n");
        }
        output.append(verse(endVerse));
        return output.toString();
    }
    
    String sing() {
        return verses(1, 12);
    }
}