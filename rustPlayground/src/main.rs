extern crate reqwest;

use std::io::Read;

fn main() -> Result<(), Box> {
// Replace with your OpenWeatherMap API key
let api_key = "39fb3f58fc8065ba580a0deec8687f7f";

// Replace with the city and country code you want to get weather data for
let city = "Houston";
let country_code = "USA";

// Create the API URL with the provided city, country code, and API key
let url = format!(
    "https://api.openweathermap.org/data/2.5/weather?q={},{}&appid={}",
    city, country_code, api_key
);

// Send an HTTP GET request to the API
let mut response = reqwest::blocking::get(&url)?;

// Check if the request was successful (status code 200 OK)
if response.status().is_success() {
    // Read the response body as a string
    let mut body = String::new();
    response
        .read_to_string(&mut body)
        .expect("Failed to read response body");

    // Parse the JSON response
    let json_response: serde_json::Value = serde_json::from_str(&body)?;

    // Extract weather data from the JSON response
    let temperature = json_response["main"]["temp"].as_f64().unwrap();
    let description = json_response["weather"][0]["description"].as_str().unwrap();

    // Display the weather information
    println!("City: {}", city);
    println!("Temperature: {:.2}°C", temperature - 273.15);
    println!("Description: {}", description);
} else {
    println!("Failed to fetch weather data: {}", response.status());
}

Ok(())
}

