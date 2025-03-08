import { ChangeEvent, useState } from "react";
import "./App.css";

interface World {
  x: string;
  y: string;
  z: string;
}

const defaultWorld: World = { x: "", y: "", z: "" };

function App() {
  const [overworld, setOverworld] = useState<World>(defaultWorld);
  const [nether, setNether] = useState<World>(defaultWorld);

  const handleOverworldChange = (e: ChangeEvent<HTMLInputElement>) => {
    const { name, value } = e.target;
    const numValue = value === "" ? "" : parseFloat(value);
    setOverworld((prev) => ({ ...prev, [name]: value }));
    if (numValue !== "") {
      setNether((prev) => ({
        ...prev,
        [name]: name === "y" ? numValue : numValue / 8,
      }));
    } else {
      setNether((prev) => ({ ...prev, [name]: "" }));
    }
  };

  const handleNetherChange = (e: ChangeEvent<HTMLInputElement>) => {
    const { name, value } = e.target;
    const numValue = value === "" ? "" : parseFloat(value);
    setNether((prev) => ({ ...prev, [name]: value }));
    if (numValue !== "") {
      setOverworld((prev) => ({
        ...prev,
        [name]: name === "y" ? numValue : numValue * 8,
      }));
    } else {
      setOverworld((prev) => ({ ...prev, [name]: "" }));
    }
  };

  return (
    <div className="container">
      <div className="box">
        <h2>Overworld Coordinates</h2>
        <div>
          <input
            type="number"
            name="x"
            value={overworld.x}
            onChange={handleOverworldChange}
            placeholder="X"
            style={{ padding: "5px", width: "80px" }}
          />
          <input
            type="number"
            name="y"
            value={overworld.y}
            onChange={handleOverworldChange}
            placeholder="Y"
            style={{ padding: "5px", width: "80px" }}
          />
          <input
            type="number"
            name="z"
            value={overworld.z}
            onChange={handleOverworldChange}
            placeholder="Z"
            style={{ padding: "5px", width: "80px" }}
          />
        </div>
      </div>

      <div className="box">
        <h2>Nether Coordinates</h2>
        <div>
          <input
            type="number"
            name="x"
            value={nether.x}
            onChange={handleNetherChange}
            placeholder="X"
            style={{ padding: "5px", width: "80px" }}
          />
          <input
            type="number"
            name="y"
            value={nether.y}
            onChange={handleNetherChange}
            placeholder="Y"
            style={{ padding: "5px", width: "80px" }}
          />
          <input
            type="number"
            name="z"
            value={nether.z}
            onChange={handleNetherChange}
            placeholder="Z"
            style={{ padding: "5px", width: "80px" }}
          />
        </div>
      </div>
    </div>
  );
}

export default App;
