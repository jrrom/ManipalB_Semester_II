{
  description = "Programs done during my Data Visualisation Lab classes.";
  inputs = {
    nixpkgs.url = "github:nixos/nixpkgs/nixos-unstable";
  };

  outputs = { self, nixpkgs }:
    let
      system = "x86_64-linux";
      pkgs = nixpkgs.legacyPackages.${system};
    in
      {
        devShells.${system}.default = pkgs.mkShell {
          name = "Python Shell";
          nativeBuildInputs = with pkgs; [
            pkgs.python313
          ];
        };
      };
}
