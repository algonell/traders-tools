#parse FTSE Russell 3000 tickers via pdf downloaded from the official website:
#https://www.ftserussell.com/files/support-document/2019-membership-list-russell-3000

from tabula import read_pdf
import glob

print("Reading PDF...")
l = read_pdf(glob.glob('./*.pdf')[0], pages ='all')

s = set()

for x in l:
    s.update(x['Ticker'].dropna().str.replace('.', '-', regex=False))
    s.update(x['Unnamed: 0'].dropna().str.replace('.', '-', regex=False))

print('Stocks', len(s))

#to file
print("Saving to file...")
with open('./RU3000.txt', 'w') as f:
    for x in sorted(s):
        f.write("%s\n" % x)
