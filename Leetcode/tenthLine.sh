# Read from the file file.txt and output the tenth line to stdout.
sed '10q;d' file.txt

#or this
cat file.txt | sed -n 10p
