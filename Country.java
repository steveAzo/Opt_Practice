import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Country {
    private String name;
    private long population;
    private float area;
    
    public Country(String name, long population, float area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setPopulation(long population) {
        if(population >= 0) {
            this.population = population;
        }
    }

    public void setArea(float area) {
        if(area >= 0) {
            this.area = area;
        }
    }

    //getter for name
    public String getName() {
        return name;
    }

    //getter for popultion
    public long getPopulation() {
        return  population;
    }

    //getter for area
    public float getArea() {
        return area;
    }

    //method for calculating the population density of a country
    public float populationDensity(long population, float area) {
        if(area == 0){
            return 0.00f;
        }
        return (float)population / area;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Country> countryList = new ArrayList<>();


        System.out.println("How many countries do you want to check?: ");
        int numberOfCountries = scanner.nextInt();
        
        for(int i = 1; i <= numberOfCountries; i++) {
            System.out.println("Enter the name of the country " + i + ": ");
            String name = scanner.next();

            System.out.println("What is the population of the country" + ": ");
            long population = scanner.nextLong();

            System.out.println("Enter the area of the contry" + ": ");
            float area = scanner.nextFloat();

            Country country = new Country(name, population, area);
            countryList.add(country);

        }
        
        Country countryWithLargestPopulation = null;
        long largestPopulation = 0;
        for(Country country : countryList) {
            if(countryWithLargestPopulation == null || country.getPopulation() > largestPopulation) {
                countryWithLargestPopulation = country;
                largestPopulation = country.getPopulation();
            }
        }

        if(countryWithLargestPopulation != null) {
            System.out.println("The country with the largest population is " + countryWithLargestPopulation.getName());
            System.out.println("Population: " + countryWithLargestPopulation.getPopulation());
        }
        else{
            System.out.println("No country in the list");
        }  
        
        //this part of the code prints out the country with the largest area.
        Country countryWithLargestArea = null;
        float largestArea = Float.MIN_VALUE;
        for(Country country : countryList) {
            if(country.getArea() > largestArea) {
                countryWithLargestArea = country;
                largestArea = country.getArea();
            }
        }

        if(countryWithLargestArea != null) {
            System.out.println("The country with the largest area is: " + countryWithLargestArea.getName());
            System.out.println("It's area is: " + countryWithLargestArea.getArea());
        }
        else{
            System.out.println("No country in the list");
        }

        //this part gets and print out the country with the largest population density
        Country countryWithLargestPopulationDensity = null;
        float largestPopulationDensity = Float.MIN_VALUE;

        for(Country country : countryList) {
            float density = country.populationDensity(country.population, country.area);

            if(density > largestPopulationDensity){
                countryWithLargestPopulationDensity = country;
                largestPopulationDensity = density;
            }
        }

        if(countryWithLargestPopulationDensity != null) {
            System.out.println("The country with the largest population density is:" + countryWithLargestPopulationDensity.getName());
            System.out.println("It's population density is: " + largestPopulationDensity);
        }
        else{
            System.out.println("No country in the list");
        }
    }

}