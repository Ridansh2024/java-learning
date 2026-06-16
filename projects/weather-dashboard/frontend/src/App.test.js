import { render, screen } from '@testing-library/react';
import App from './App';

test('renders weather dashboard heading', () => {
  render(<App />);
  const heading = screen.getByText(/weather dashboard/i);
  expect(heading).toBeInTheDocument();
});
