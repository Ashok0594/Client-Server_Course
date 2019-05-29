import os
import sys
import re
from operator import itemgetter
from mysql.connector import (connection)

count=0
try:
   cnx = connection.MySQLConnection(user='itmd521', password='akrams94',
                                 host='localhost',port = '3306')
   cursor = cnx.cursor()
   query = "INSERT INTO ncdc.dataperyear(Date,USAF_Station,WBAN_Id,Year,Time,Latitude,Longitude,"\
           "Elevation,Wind_Direction,Quality_1,Sky_Height,Quality_2,Visiblity_Distance,Quality_3,Air_Temperature"\
           ",Air_Quality,Dew_Temperature,Dew_Quality,Atmospheric_Pressure,Pressure_Quality) "\
           "VALUES(STR_TO_DATE(%s,'%m/%d/%Y'),%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s);"
   for line in sys.stdin:
      if (line[87]=="+"):
         temperature=line[88:92]
      else:
         temperature=line[87:92]
      usaf=line[4:10]
      date=line[19:21]+"/"+line[21:23]+"/"+line[15:19]
      wban=line[10:15]
      time=line[23:27]
      latitude=line[28:34]
      longitude=line[34:41]
      elevation=line[46:51]
      wind=line[60:63]
      windq=line[63:64]
      sky=line[70:75]
      skyq=line[75:76]
      vdist=line[78:84]
      vdistq=line[84:85]
      quality=line[92:93]
      year=line[15:19]
      dewt=line[93:98]
      dewtq=line[98:99]
      atpr=line[99:104]
      atprq=line[104:105]
      if (temperature !='9999' and re.match("[01459]", quality) ):
         args=(date,usaf,wban,year,time,latitude,longitude,elevation,wind,windq,sky,skyq,vdist,vdistq,temperature,quality,dewt,dewtq,atpr,atprq)
         cursor.execute(query, args)
         count=count+1
      if (count%1000000==0):
         print(count)
         cnx.commit()
   cnx.commit()
except Exception as e:
   print(e)

