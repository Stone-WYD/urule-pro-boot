echo "URULE_PROFILE=$URULE_PROFILE"
if [ ! $URULE_PROFILE ] ;then
	rm /urule/urule.properties
	rm /urule/classes/urule-init.properties
	cp /urule/classes/urule-init-db.properties /urule/classes/urule-init.properties
	java -Xbootclasspath/a:/urule/classes -jar /urule/urule-pro-boot.jar
else 
	java -Xbootclasspath/a:/urule/classes -jar /urule/urule-pro-boot.jar --spring.profiles.active=$URULE_PROFILE
fi