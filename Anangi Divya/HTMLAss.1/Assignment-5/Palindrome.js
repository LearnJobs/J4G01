<html>
    <head>
        <title>Alphabet Palindrome Pyramid Pattern</title>
    </head>
    <body>
             <script type="text/javascript">
            var space=9,ascending=2,descending=1;
            var limit=space;
            var char=97;
            document.write("<table align='center' cellpadding='05'>");
                for(var i=0;i<limit;i++)
                {
                    document.writeln("<tr>");
                    for(var j=1;j<space;j++)    document.writeln("<td>&nbsp;</td>");    
                    for(var k=1;k<ascending;k++)
                    {
                        document.writeln("<td align='center'>"+String.fromCharCode(char)+"</td>");
                        char++;	
                    }
                    char--;
                    for(var s=descending-1;s>=1;s--)
                    {
                        char--;
                        document.writeln("<td align='center'>"+String.fromCharCode(char)+"</td>");
                    }
                    for(var j=1;j<space;j++)    document.writeln("<td>&nbsp</td>");
                    space=space-1;
                    ascending=ascending+1;
                    descending=descending+1;
                    document.writeln("</tr>");
                } 
                document.write("</table>");
        </script>
    </body>
</html>