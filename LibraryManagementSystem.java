class Book {
    int bookId;
    String title;
    String author;
    double price;

    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class LibraryManagementSystem {

    // Task 1: Remove duplicate books
    public static int removeDuplicates(Book[] books, int n) {

        if (n == 0) {
            return 0;
        }

        int unique = 1;

        for (int i = 1; i < n; i++) {

            if (books[i].bookId != books[unique - 1].bookId) {
                books[unique] = books[i];
                unique++;
            }
        }

        return unique;
    }

    // Task 2: Search book by partial title
    public static void searchByTitle(Book[] books, int count, String query) {

        query = query.toLowerCase();

        System.out.println("\nSearch Results for '" + query + "':");

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (books[i].title.toLowerCase().contains(query)) {

                System.out.println("- Found: [" + books[i].bookId + "] "
                        + books[i].title + " (Rs. " + books[i].price + ")");

                found = true;
            }
        }

        if (!found) {
            System.out.println("No book found.");
        }
    }

    // Task 3: Selection Sort by price
    public static void sortByPrice(Book[] books, int count) {

        int swaps = 0;

        for (int i = 0; i < count - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < count; j++) {

                if (books[j].price < books[minIndex].price) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {

                Book temp = books[i];
                books[i] = books[minIndex];
                books[minIndex] = temp;

                swaps++;
            }
        }

        System.out.println("\nBooks Sorted by Price:");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". [" + books[i].bookId + "] "
                    + books[i].title + " - Rs. " + books[i].price);
        }

        System.out.println("Total Swaps: " + swaps);
    }

    // Task 4: Binary Search by price
    public static int searchByPrice(Book[] books, int count, double targetPrice) {

        int left = 0;
        int right = count - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (books[mid].price == targetPrice) {
                return mid;
            }

            if (books[mid].price < targetPrice) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    // Task 5: Sliding Window
    public static int minBooksForTargetCost(
            Book[] books, int count, double targetCost) {

        int left = 0;
        double currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < count; right++) {

            currentSum += books[right].price;

            while (currentSum >= targetCost) {

                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                }

                currentSum -= books[left].price;
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }

    // Main method
    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Data Structures", "Mark", 400.0),
                new Book(101, "Data Structures", "Mark", 400.0),
                new Book(102, "Java Basics", "James", 300.0),
                new Book(103, "Python Guide", "Guido", 600.0),
                new Book(104, "Database Systems", "Raghu", 500.0),
                new Book(105, "Computer Networks", "Andrew", 700.0)
        };

        int count = books.length;

        // Task 1
        count = removeDuplicates(books, count);

        System.out.println("Unique Books Count: " + count);

        System.out.println("Book List:");

        for (int i = 0; i < count; i++) {
            System.out.println("[" + books[i].bookId + "] "
                    + books[i].title + " - Rs. " + books[i].price);
        }

        // Task 2
        searchByTitle(books, count, "data");

        // Task 3
        sortByPrice(books, count);

        // Task 4
        double targetPrice = 500.0;

        System.out.println("\nSearching for Price Rs. " + targetPrice + "...");

        int index = searchByPrice(books, count, targetPrice);

        if (index != -1) {
            System.out.println("Result: Book found at index " + index
                    + ": [" + books[index].bookId + "] "
                    + books[index].title
                    + " (Rs. " + books[index].price + ")");
        } else {
            System.out.println("Book not found.");
        }

        // Task 5
        double targetCost = 1000.0;

        System.out.println("\nFinding minimum consecutive books whose "
                + "total price >= Rs. " + targetCost + "...");

        int result = minBooksForTargetCost(books, count, targetCost);

        System.out.println("Minimum Consecutive Books Needed: " + result);
    }
}