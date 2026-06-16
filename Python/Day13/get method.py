import requests as req
import pandas as pd

res =req.get("https://api.restful-api.dev/objects")
print(res.status_code)
response = res.json()
product_list=[]

for item in response:
    data = {'id': item['id'], 'name': item['name']}
    if item['data']:
        data.update(item['data'])
    product_list.append(data)
print(product_list)

df= pd.DataFrame(product_list)
df.to_csv('product_data.csv')

# """send query params as list of tuples containing param name value """
# params=[('id',5),('id',19),('id',57)]
# res= req.get("https://api.restful-api.dev/objects",param=params)
# print(res.status_code)
# response = res.json()
# print(response)
#
# """path param :to retrieve one resource uniquely"""
# p_id= 19
# res= req.get(f"https://api.restful-api.dev/objects/{p_id}")
# print(res.status_code)
# response = res.json()
# print(response)
