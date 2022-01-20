echo "URULE_PROFILE=$URULE_PROFILE"
echo "DRIVER_VERSION=$DRIVER_VERSION"

CLASSPATH="/urule/classes"
JARFILE="/urule/urule-pro-boot.jar"
LIBFILE=""
HOME="/urule_home"

echo "HOME=$HOME"

if [ ! $URULE_PROFILE ] 
then
	java -Xbootclasspath/a:$CLASSPATH -jar $JARFILE --spring.profiles.active=embed
elif [ $URULE_PROFILE = 'dm' ] 
then
	if [ $DRIVER_VERSION = 7 ] 
	then
		LIBFILE=":/urule/lib/dm/7/DmJdbcDriver17.jar"
	elif [ $DRIVER_VERSION = 8 ] 
	then
		LIBFILE=":/urule/lib/dm/8/dm-connector-java-8.1.1.126.jar"
	else
		LIBFILE=":/urule/lib/dm/8/dm-connector-java-8.1.1.126.jar"
	fi
	CLASSPATH=${CLASSPATH}${LIBFILE}
	echo "CLASSPATH=${CLASSPATH}"
	java -Xbootclasspath/a:$CLASSPATH -DuruleHome=$HOME -jar $JARFILE 
elif [ $URULE_PROFILE = 'mysql' ] 
then
	if [ $DRIVER_VERSION = 5 ] 
	then
		LIBFILE=":/urule/lib/mysql/5/mysql-connector-java-5.1.49.jar"
	elif [ $DRIVER_VERSION = 8 ] 
	then
		LIBFILE=":/urule/lib/mysql/8/mysql-connector-java-8.0.26.jar"
	else
		LIBFILE=":/urule/lib/mysql/8/mysql-connector-java-8.0.26.jar"
	fi
	CLASSPATH=${CLASSPATH}${LIBFILE}
	echo "CLASSPATH=${CLASSPATH}"
	java -Xbootclasspath/a:$CLASSPATH -DuruleHome=$HOME -jar $JARFILE
elif [ $URULE_PROFILE = 'sqlserver' ] 
then
	if [ $DRIVER_VERSION = 6 ] 
	then
		LIBFILE=":/urule/lib/sqlserver/6/mssql-jdbc-6.4.0.jre8.jar"
	elif [ $DRIVER_VERSION = 7 ] 
	then
		LIBFILE=":/urule/lib/sqlserver/7/mssql-jdbc-7.4.1.jre8.jar"
	elif [ $DRIVER_VERSION = 8 ] 
	then
		LIBFILE=":/urule/lib/sqlserver/8/mssql-jdbc-8.4.1.jre8.jar"
	elif [ $DRIVER_VERSION = 9 ] 
	then
		LIBFILE=":/urule/lib/sqlserver/9/mssql-jdbc-9.4.0.jre8.jar"
	else 
		LIBFILE=":/urule/lib/sqlserver/9/mssql-jdbc-9.4.0.jre8.jar"
	fi
	CLASSPATH=${CLASSPATH}${LIBFILE}
	echo "CLASSPATH=${CLASSPATH}"
	java -Xbootclasspath/a:$CLASSPATH -DuruleHome=$HOME -jar $JARFILE
elif [ $URULE_PROFILE = 'oracle' ] 
then
	if [ $DRIVER_VERSION = 12 ] 
	then
		LIBFILE=":/urule/lib/oracle/12/ojdbc8-12.2.0.1.jar"
	elif [ $DRIVER_VERSION = 18 ] 
	then
		LIBFILE=":/urule/lib/oracle/18/ojdbc8-18.15.0.0.jar"
	elif [ $DRIVER_VERSION = 19 ] 
	then
		LIBFILE=":/urule/lib/oracle/19/ojdbc8-19.12.0.0.jar"
	elif [ $DRIVER_VERSION = 21 ] 
	then
		LIBFILE=":/urule/lib/oracle/21/ojdbc8-21.3.0.0.jar"
	else 
		LIBFILE=":/urule/lib/oracle/21/ojdbc8-21.3.0.0.jar"
	fi
	CLASSPATH=${CLASSPATH}${LIBFILE}
	echo "CLASSPATH=${CLASSPATH}"
	java -Xbootclasspath/a:$CLASSPATH -DuruleHome=$HOME -jar $JARFILE
elif [ $URULE_PROFILE = 'db2' ] 
then
	LIBFILE=":/urule/lib/db2/db2jcc.jar"
	CLASSPATH=${CLASSPATH}${LIBFILE}
	echo "CLASSPATH=${CLASSPATH}"
	java -Xbootclasspath/a:$CLASSPATH -DuruleHome=$HOME -jar $JARFILE
elif [ $URULE_PROFILE = 'postgresql' ] 
then
	LIBFILE=":/urule/lib/postgresql/42/postgresql-42.3.0.jar"
	CLASSPATH=${CLASSPATH}${LIBFILE}
	echo "CLASSPATH=${CLASSPATH}"
	java -Xbootclasspath/a:$CLASSPATH -DuruleHome=$HOME -jar $JARFILE
elif [ $URULE_PROFILE = 'hsql' ] 
then
	java -Xbootclasspath/a:$CLASSPATH -DuruleHome=$HOME -jar $JARFILE
elif [ $URULE_PROFILE = 'embed' ] 
then
	java -Xbootclasspath/a:$CLASSPATH -DuruleHome=$HOME -jar $JARFILE
else 
	java -Xbootclasspath/a:$CLASSPATH -jar $JARFILE --spring.profiles.active=embed
fi