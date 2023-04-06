# Genius API Song Finder
## Description

The Genius API Song Finder is a web application that allows users to search for hit songs by a specific artist using the Genius API. Users can enter an artist name, and the application will retrieve a list of hit songs by that artist, displaying the song title, artist name, date released, and an image for each song.

## API Endpoint URL
The endpoint URL used to retrieve the song information from the Genius API is: 
*https://api.genius.com/search?q=*

To search for songs by a specific artist, append the artist name to the end of the URL. 

## Postman Link
The following link can be used in Postman to retrieve a list of hit songs by a specific artist: 
*localhost:8080/songs?artistName=*

To search for songs by a specific artist, append the artist name to the end of the URL. 

## Installation

To run the application, you will need to have the following software installed on your computer:

IntelliJ IDEA with Spring Boot support
Node.js
Vue.js

1. Clone the repository to your local machine.
2. Open the project in IntelliJ IDEA.
3. Install any required dependencies by running the following command in the terminal: npm install
4. Run the Spring Boot application by clicking on the green "Play" button in IntelliJ IDEA.
5. Start the Vue.js development server by running the following command in the terminal: npm run serve
6. Open your web browser and go to *http://localhost:8080* to access the application.

## Usage

To search for hit songs by a specific artist:

1. Enter the artist name in the search bar on the homepage.
2. Click the "Search" button.
3. The application will retrieve a list of hit songs by the artist and display the song title, artist name, date released, and an image for each song.

## Credits

This project uses the Genius API to retrieve song information. Visit *https://docs.genius.com/* for more information about the API.