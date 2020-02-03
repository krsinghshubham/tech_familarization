# import mysql.connector

# db = mysql.connector.connect(
#     host="localhost", user="shubham", passwd="root", database="testdatabase"
# )
# mycursor=db.cursor()

# m=[3,43,53,35,5353]
# i=0
# while i<len(m):
#     print(m[i])
#     i+=1
# Exercise!


def add(n, m):
    def jodd(nn, mm):
        return nn + mm
    return jodd(n, m)
    print("5")

total=add(3,54)
print(total)

