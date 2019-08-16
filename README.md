# Shell-cli
A combo Spring Shell and Spring CommandLineRunner (ApplicationRunner)

## Description
This project aims to be a sample to easily start a Spring Shell CLI that can be run both in interactive mode and directly from command line (Base on Spring Application Runner).

## Installation
The produced shell-cli is also aim to be install to easily be used as linux command line.

1. Create install folder
````bash
sudo mkdir /var/shell-cli
sudo cp target/shell-cli-1.0.0.jar /var/shell-cli/shell-cli.jar
```` 

2. Create symbolic link
````bash
sudo ln -s /var/shell-cli/shell-cli.jar /bin/shell-cli
````

3. Make it executable
````bash
sudo sudo chmod +x /bin/shell-cli
````

4. Test it
````bash
shell-cli help
````