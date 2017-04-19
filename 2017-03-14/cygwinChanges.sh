#Cygwin changes
# 1. change home directory to /cygdrive/Users/<username>
$ vim /etc/nsswitch.conf
# uncomment line with db_home by getting rid of '#'
 db_home: /%H
# exit Cygwin and open it again and do 'ls' to see if it changed
# home directory

# 2. change 'ls' command's color scheme
$ cp /home/<username>/.bash_profile ~/.bash_profile
$ cp /home/<username>/.bashrc ~/.bashrc
$ vim .bashrc
# add the following lines to .bashrc file

#alias for ls
alias ls="ls --color=auto"

#colors for ls
export LS_COLORS="di=36;1:ln=36;1:ex=31;"

# exit Cygwin and open it again and do 'ls' to see if colors
# show up for directories


# 3. add 'subl' command to Cygwin
$ cd
$ vim .bashrc
# add following lines to end of '.bashrc' file

#alias for subl
alias subl="/cygdrive/c/Program\ Files/Sublime\ Text\ 3/subl.exe"

