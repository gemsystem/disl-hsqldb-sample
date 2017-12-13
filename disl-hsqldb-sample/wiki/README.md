Wiki is generated using [Hugo](https://gohugo.io) tool.

## Instalation

 * Downlaod Hugo (https://github.com/spf13/hugo/releases/tag/v0.19)
 * Install (https://gohugo.io/overview/installing/)
    * Copy hugo-xxxxx.exe into  <smth>/Hugo/bin/hugo.exe
    * Add <smth>/Hugo/bin into the system path

## Run server

    cd wiki
    hugo server

## Generate wiki

    cd wiki
    hugo --baseURL [baseURL]

 Wiki is generated into public directory. You can set up baseURL parameter nad set up an URL where wiki will be generated.

