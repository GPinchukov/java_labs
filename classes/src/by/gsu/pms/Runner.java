package by.gsu.pms;


public class Runner {
    public static void main(String[] args) {

        Trip[] trips = {
                new Trip("Ed Sheeran", 40000, 7),
                new Trip("Tyler Joseph", 20000, 5),
                null,
                new Trip("Abele Jhon", 12000, 7),
                new Trip("Naiton Curt", 65000, 6),
                new Trip("Gyrorgy Fall", 74000, 8),
                new Trip(),
        };

        for (Trip trip : trips) {
            if (trip != null) {
                trip.show();
            }
        }

        trips[trips.length - 1].setTransport(3000);

        System.out.println("Duration = " + (trips[0].getDays() + trips[1].getDays()));

        for (Trip trip : trips) {
            System.out.println(trip);
        }

        int expenses = 0;
        for (Trip trip : trips) {
            if (trip != null) {
                expenses += trip.getTotal();
            }
        }
        System.out.println("Total expenses = " + expenses);


        int maxTotal = 0;
        String account = "";
        for (Trip trip : trips) {
            if (trip != null && trip.getTotal() > maxTotal) {
                account = trip.getAccount();
            }
        }
        System.out.println(account);
    }
}