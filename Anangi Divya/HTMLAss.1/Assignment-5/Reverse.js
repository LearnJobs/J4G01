<html>
    <head>
        <title>Reverse Mountain Number Pattern</title>
    </head>
    <body>
             <script type="text/javascript">
            var space=-1,ascending=descending=limit=9;
            document.write("<table align='center' cellpadding='5'>");
                for(var i=1;i<limit;i++)
                {
                    document.writeln("<tr>");
                    for(var j=1;j<=ascending;j++)       document.writeln("<td align='center'>"+j+"</td>");
                    for(var k=1;k<=space;k++)           document.writeln("<td>&nbsp;</td>");
                    for(var s=descending;s>=1;s--)      
                    {
                        if(s==9)    continue;   
                        document.writeln("<td align='center'>"+s+"</td>");
                    }
                    space=space+2;
                    ascending--;
                    descending--;
                    document.writeln("</tr>");
                } 
                document.write("</table>");
        </script>
    </body>
</html>