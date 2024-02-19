import javax.swing.JOptionPane;

public class FlowerShop {
    public static void main(String[] args) {
        Flower[] inventory = new Flower[10];

        // Populate the flower inventory
        for (int i = 0; i < inventory.length; i++) {
            String name = JOptionPane.showInputDialog(null, "Enter name for flower " + (i + 1) + ":");
            String color = JOptionPane.showInputDialog(null, "Enter color for flower " + (i + 1) + ":");
            double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter price for flower " + (i + 1) + ":"));
            int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter quantity for flower " + (i + 1) + ":"));

            inventory[i] = new Flower(name, color, price, quantity);
        }

        // Display all flower details
        StringBuilder inventoryDetails = new StringBuilder("Flower Inventory:\n");
        for (Flower flower : inventory) {
            inventoryDetails.append(flower).append("\n");
        }
        JOptionPane.showMessageDialog(null, inventoryDetails);

        // Calculate and display total inventory value
        double totalValue = 0;
        for (Flower flower : inventory) {
            totalValue += flower.getPrice() * flower.getQuantity();
        }
        JOptionPane.showMessageDialog(null, "Total Inventory Value: $" + totalValue);

        // Search for a flower by name
        String searchName = JOptionPane.showInputDialog(null, "Enter the name of the flower to search:");
        boolean found = false;
        for (Flower flower : inventory) {
            if (flower.getName().equalsIgnoreCase(searchName)) {
                JOptionPane.showMessageDialog(null, "Flower found:\n" + flower);
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Flower not found in inventory.");
        }

        // Restock a specific flower
        String restockName = JOptionPane.showInputDialog(null, "Enter the name of the flower to restock:");
        int restockQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the quantity to restock:"));
        for (Flower flower : inventory) {
            if (flower.getName().equalsIgnoreCase(restockName)) {
                flower.setQuantity(flower.getQuantity() + restockQuantity);
                JOptionPane.showMessageDialog(null, "Restocked " + restockQuantity + " of " + restockName +
                        "\nUpdated Flower details:\n" + flower);
                break;
            }
        }
    }
}
