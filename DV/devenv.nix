{ pkgs, lib, config, inputs, ... }:

{
  # packages = [ pkgs.git ];

  languages.python = {
    enable = true;
    package = pkgs.python313;
  };
}
