package cmd

import (
	"fmt"
	"os"

	"github.com/spf13/cobra"
)

var rootCmd *cobra.Command = &cobra.Command{
	Use: "nethertravel",
	Run: root,
}

func root(cmd *cobra.Command, args []string) {

}

func Execute() {
	if err := rootCmd.Execute(); err != nil {
		fmt.Println("failed to run root cmd")
		os.Exit(1)
	}
}
