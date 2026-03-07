import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Navbar from './components/Navbar';
import Home from './pages/Home';
import PersonaBuilder from './pages/PersonaBuilder';
import Results from './pages/Results';

function App() {
  return (
    <Router>
      <div className="min-h-screen flex flex-col font-sans">
        <Navbar />
        <main className="flex-1 flex flex-col">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/form" element={<PersonaBuilder />} />
            <Route path="/schemes" element={<Results />} />
          </Routes>
        </main>
      </div>
    </Router>
  );
}

export default App;
