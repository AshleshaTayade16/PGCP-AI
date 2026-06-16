# Q.6
# Following data displays min/max/average temp for cities
# weather= [{'Mumbai' : [28, 30, 32]},.....]
#
# 1. Print the weather data
# 2. Print the city with maximum/min temp
# 3. Print all the cities that expereince min temp more than 30 degree
# 4. Create a dictionary to print 'City':'Ave temp'

weather = [{'Mumbai': [28, 30, 43]},
           {'Pune': [25, 29, 31]},
           {'Delhi': [20, 33, 38]},
           {'Chennai': [31, 33, 36]}]

# convert list of dictionaries into one dictionary
weather_dict = {city: temps for d in weather for city, temps in d.items()}

# 1. Print weather data
print("Weather Data:")
print(weather_dict)

# 2. City with maximum and minimum temperature
max_city = max(weather_dict.items(), key=lambda x: max(x[1]))
min_city = min(weather_dict.items(), key=lambda x: min(x[1]))
print("City with Maximum Temperature:", max_city[0], max(max_city[1]))
print("City with Minimum Temperature:", min_city[0], min(min_city[1]))

# 3. Cities with minimum temp more than 30
cities = list(filter(lambda x: min(x[1]) > 30, weather_dict.items()))
print("Cities with min temp > 30:", list(map(lambda x: x[0], cities)))

# 4. Dictionary City : Average Temperature
avg_temp = {city: round(sum(temps)/len(temps),2) for city, temps in weather_dict.items()}
print("City Average Temperature:", avg_temp)