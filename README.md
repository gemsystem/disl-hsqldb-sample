# disl-hsqldb-sample
Sample project demonstrating basic features of DISL. Gradle is used as build tool.

## Instalation
Set gemMavenUserRead and gemMavenPasswordRead in 
```
~/.gradle/gradle.properties
```
Email sales@gemsystem.cz for your credentials.

or

build disl into your local maven repository. Use: 
```
git clone https://github.com/gemsystem/disl.git
gradle install
```
Continue with the sample project:
```
git clone https://github.com/gemsystem/disl-hsqldb-sample.git
cd disl-hsqldb-sample/disl-hsqldb-sample
gradle installDist
```

### Configure Eclipse IDE project (optional)
```
gradle eclipse
```

## Play with DISL
```
cd build/install/disl-hsqldb-sample/bin
```
Start lightweight inmemory databse server `startDB.bat`, deploy sample data model using DISL job `deployDB.bat`, load target table using DISL job `loadDB.bat` and finally check data in database `startDbClient.bat`.

## Generate wiki
```
cd build/install/disl-hsqldb-sample/bin
generateWiki.bat
```

Read more about [wiki](disl-hsqldb-sample/wiki/).
