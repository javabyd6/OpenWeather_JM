# OpenWeather

  Stworzyc projekt OpenWeather_XX - pl.sda.weather
  Dodac mavena, gitignore, fasterxml
  Stworzyc repozitorium na github
  Stworzyc klasy mapujace - Weather, Location, Current, Condition
  
  
  Funkcjonalność 
  Użytkownik wpisuje nazwę miejscowości.
  Program zwraca temperaturę dla wpisanej miejscowości.
  
  Uporządkować kod:
  - mechanizm pobierania jsona przenieść do klasy WeatherService (klase należy stworzyć w pakiecie service) klasa niech posiada zmienną typu String o nazwie finalURL
  - konstrutor klasy niech posiada 2 pola String url, String apiKey
  - wywołanie powinno wyglądać:
   WeatherService weatherService = new WeatherService(
                  "http://api.apixu.com/v1/current.json",
                  "KLUCZ API"
          );
  - w konstruktorze do zmiennej finalURL przypisac url i apiKey
  - w klasie WeatherService stworzyć metodę getCityWeather(String city) - metoda powinna zwracać obiekt klasy Weather
  metoda powinna dokleić do zmiennej finalURL nazwę miasta i wykonać zapytanie na adres w celu pobrania wszystkich danych
  - zwrócone dane wyświetlić na ekranie (dowolnie) 
  