A template project featuring a devcontainer setup for Datascience with Clojure using several libraries from [scicloj](https://scicloj.github.io/)

It sets up an dev container environment with several tool s and libaries for datascience in Clojure.

# Quickstart
1. Craete a new GitHub repository based on this template
2. Clone and open repository with VSCode / devpod / Codespaces and wait for container build
3. "jack in" inside the devconatiner
4. Enjoy Clojure and R  + python from Clojure  (using ClojisR + libpython-clj)
5. Customize libraries
    * deps.edn: Clojure + Java
    * devcontainer.json: python libraries (via calls to pip in devcontainer.json) (or add poetry feature)
    * devcontainer.json: R libraries (see [r-packages](ghcr.io/rocker-org/devcontainer-features/r-packages)

6. (install more features in devcontainer: https://containers.dev/features)
   


## installed inside devcontainer
The provided devcontainer.json installs in the devcontainer:

* Clojure (incl. clojisr and libpython-clj)
* Python (packages can be added vi calling "pip" in devcontainer.json)
* R (packages can be added in devcontainer.json)
   * rstudio-server

* deps.edn with Clojure libraries for Data science from scicloj
* noVNC + lite desktop incl port forwarding
* Emacs
* quarto cli
* docker-in-docker
* leiningen
* babashka
* lsp

### Graphical Emacs in web-noVNC
In the default settings, we will get a vanilla Emacs running in noVNC.
The Emacs setup can be configured via provding a specific script in a fixed location one the Codespace
instance, which can be done using the dotfile support of devctonater / Codespaces / VSCode

See here: [dotfiles](https://code.visualstudio.com/docs/devcontainers/containers#_personalizing-with-dotfile-repositories)

If there is a file in `/home/vscode/.setup-ide/setup-ide.sh` it will be executed after container creation.
This can do "whatever" to configure Emacs from your own configuration.
(Baically the script can do everything)
My `setup-ide.sh` configures Doom Emacs with my personal configuration.





