import requests as req
import pandas as pd
res=req.get("https://restful-booker.herokuapp.com/booking")
print(res.status_code)
response=res.json()
print("-----------Response Data-------------")
print(response)

booking_list=[]
for item in response:
    data = {'bookingid': int(item['bookingid'])}
    booking_list.append(data)

print("----------Booking List-----------")
print(booking_list)

df=pd.DataFrame(booking_list)
df.to_csv("booking_data.csv")

id1=11
res1=req.get(f"https://restful-booker.herokuapp.com/booking/{id1}")
print(res1.status_code)
response1=res1.json()
print(response1)





data1={}
for id1 in range(11,12):
    res1=req.get(f"https://restful-booker.herokuapp.com/booking/{id1}")
    print(res1.status_code)
    response1=res1.json()
    print(response1)
    data1.update(response1)

print(data1)
df=pd.DataFrame(data1)
df.to_csv("book_data.csv")
#
# print(data1)
# df=pd.DataFrame(data)
# df.to_csv("booking_data.csv")
