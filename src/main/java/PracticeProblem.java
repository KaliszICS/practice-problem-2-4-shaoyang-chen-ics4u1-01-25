public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void selectionSortName(String[] name, int[] ages) {
        for (int i = 0; i < name.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < name.length; j++) {
                if (name[j].compareToIgnoreCase(name[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = name[minIndex];
                int tempAge = ages[minIndex];
                name[minIndex] = name[i];
                ages[minIndex] = ages[i];
                name[i] = temp;
                ages[i] = tempAge;
            }
        }
    }

    public static void selectionSortAge(String[] name, int[] age) {
        for (int i = 0; i < age.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < age.length; j++) {
                if (age[j] < age[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = name[minIndex];
                int tempAge = age[minIndex];
                name[minIndex] = name[i];
                age[minIndex] = age[i];
                name[i] = temp;
                age[i] = tempAge;
            }
        }
    }

	

}
