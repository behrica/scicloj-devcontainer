A devcontainer file for Clojure development, support VSCode, Emacs and others

It sets up an dev container environment to have a graphical Emacs work with devcontainer / codespaces / vscode

It installs:

* Python
* R
* Clojure (incl. clojisr and libpython-clj)
* deps.edn with Clojure libraries for Data science from scicloj
* noVNC incl port forwarding
* Emacs
* Calva

In the default settings, we will get a vanilla Emacs running in noVNC.
The Emacs setup can be configured via provding a specific script in a fixed location one the Codespace
instance, which can be done using the dotfile support of devctonater / Codespaces / VSCode

See here: [dotfiles](https://code.visualstudio.com/docs/devcontainers/containers#_personalizing-with-dotfile-repositories)

If there is a file in `/home/vscode/.setup-ide/setup-ide.sh` it will be executed after container creation.
This can do "whatever" to configure Emacs from your own configuration.
(Baically the script can do everything)
My `setup-ide.sh` configures Doom Emacs with my personal configuration.





