import os
import sys
import re
from operator import itemgetter
from mysql.connector import (connection)

try:
   cnx = connection.MySQLConnection(user='itmd521', password='akrams94',
                                 host='localhost',port = '3306')
   cursor = cnx.cursor()
   query = "INSERT INTO ncdc.dataperyear(year,temperature) " \
            "VALUES(%s,%s)"
   for line in sys.stdin:
      if (line[87]=="+"):
         temperature=line[88:92]
      else:
         temperature=line[87:92]
      year=line[15:19]
      quality=line[92:93]
      if (temperature !='9999' and re.match("[01459]", quality) ):
         args = (year, temperature)
         cursor.execute(query, args)
   cnx.commit()
except Exception as e:
   print(e)
print('Sucess')